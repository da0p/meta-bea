SUMMARY = "A minimal bootstrap container image"

inherit core-image

IMAGE_INSTALL = "\
  packagegroup-core-boot \
  packagegroup-self-hosted-sdk \
  packagegroup-self-hosted-extended \
  ${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_LINGUAS = "en-us"
IMAGE_TYPEDEP_CONTAINER += "ext4"