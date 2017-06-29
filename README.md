## Quickstart

Clone repository to your layers directory.
```sh
git clone https://github.com/AntonHakansson/meta-aws-iot.git
```

Add the layer to your bblayers.conf
'''
BBLAYERS += "/path/to/meta-aws-iot"
'''

Add recipes to your local.conf.
```
IMAGE_INSTALL_append += " AWSIoTPythonSDK aws-credentials"
```

Download AWS IoT certificates and archive them in the following structure:
```
aws-certs.zip
│   cert.pem
│   private.key
│   public.key
│   root-CA.crt

```

To connect with your AWS IoT backend, you’ll need the provisioning credentials bundle you downloaded earlier. Add the following line to your local.conf to supply those credentials to the build:
```
AWS_IOT_CREDENTIALS = "/path/to/your/credentials.zip"
```
Example(assuming aws-cert.zip is located in the same directory as your local.conf):
```
AWS_IOT_CREDENTIALS = "${TOPDIR}/conf/aws-certs.zip"
```

