# Define preferred providers

# Kernel
PREFERRED_PROVIDER_virtual/kernel ?= "linux-ti-staging"

# Uboot
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot-ti-staging"
PREFERRED_PROVIDER_u-boot ?= "u-boot-ti-staging"
PREFERRED_PROVIDER_virtual/egl ?= "ti-sgx-ddk-um"
PREFERRED_PROVIDER_virtual/libgles1 ?= "ti-sgx-ddk-um"
PREFERRED_PROVIDER_virtual/libgles2 ?= "ti-sgx-ddk-um"
PREFERRED_PROVIDER_virtual/libgbm ?= "ti-sgx-ddk-um"
PREFERRED_PROVIDER_virtual/gpudriver ?= "ti-sgx-ddk-km"

