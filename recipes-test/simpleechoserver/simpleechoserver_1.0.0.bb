LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = " \
    git://github.com/TheYoctoJester/simple_echo_server.git;protocol=https \
    file://simpleechoserver.service \
"

PV = "1.0+git${SRCPV}"
SRCREV = "670f02380fa00be3d2f83b597b2811052f1991ca"

S = "${WORKDIR}/git"

DEPENDS = "boost"

REQUIRED_DISTRO_FEATURES = "systemd"
inherit cmake systemd features_check

SYSTEMD_SERVICE:${PN} = "simpleechoserver.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append() {
    install -m  0644    -D                       ${WORKDIR}/simpleechoserver.service       ${D}${systemd_system_unitdir}/simpleechoserver.service
    sed     -i  -e      's,@BINDIR@,${bindir},g' ${D}${systemd_system_unitdir}/simpleechoserver.service
}

FILES:${PN} = "\
    ${bindir} \
    ${systemd_system_unitdir} \
"