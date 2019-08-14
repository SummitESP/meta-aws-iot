DESCRIPTION = "AWS iot python module"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "python aws-credentials"

SRC_URI[md5sum] = "6835982c7fb36b19aa474d346f29ec3d"
SRC_URI[sha256sum] = "ac98d39d7230e06fc9a30bdb3398c985a7c357b10898a769db022d315855102a"

PYPI_PACKAGE = "AWSIoTPythonSDK"

inherit pypi setuptools3

