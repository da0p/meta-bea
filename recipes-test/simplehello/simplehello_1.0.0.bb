SUMMARY = "Hello world test"
DESCRIPTION = "A hello world program"
HOMEPAGE = "https://github.com/LetoThe2nd"
SECTION = "test"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1803fa9c2c3ce8cb06b4861d75310742"

SRC_URI = \
    "git://github.com/LetoThe2nd/simplehello.git;protocol=http;"

SRCREV = "af6cd35aa1c8c84014fbf1bde328798ec84d285b"
SRC_URI[sha256sum] = "7ef6e6abcbaefe8646d2ab8296c34f5f7db58fd10400046b7a3b78107f552a93"

S = "${WORKDIR}/git"

inherit cmake
EXTRA_OEMAKE = ""