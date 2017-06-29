## Quickstart

Clone repository to your layers directory.
```sh
git clone https://github.com/AntonHakansson/meta-aws-iot.git
```

Add IMAGE_INSTALL_append += " AWSIoTPythonSDK aws-credentials" to your local.conf.



Download AWS IoT certificates and archive them in the following structure:
```
aws-certs.zip
│   cert.pem
│   private.key
│   public.key
│   root-CA.crt

```

Set AWS_IOT_CREDENTIALS to certificates path in local.conf. Example AWS_IOT_CREDENTIALS = "${TOPDIR}/conf/aws-cert.zip", assuming aws-cert.zip is located in the same directory as your local.conf.

