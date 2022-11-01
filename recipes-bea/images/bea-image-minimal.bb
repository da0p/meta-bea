require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "A small image just contains some funny things"

IMAGE_INSTALL:append = " \
  packagegroup-bea-utility \
  packagegroup-bea-game \
  packagegroup-bea-test \
"

