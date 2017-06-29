DESCRIPTION = "AWS iot credentials"
SECTION = "provisioning"
LICENSE = "MIT"

do_install () {
  # If credentials were provided, install to /etc/aws-credentials/
  if [ ${AWS_IOT_CREDENTIALS} ]; then
    install -d ${D}${sysconfdir}/aws-credentials/
    unzip ${AWS_IOT_CREDENTIALS} -d ${D}${sysconfdir}/aws-credentials/
  fi
}
