# Pdf4me.Client - the java library for the Pdf4me Saas API


[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.pdf4me/pdf4me/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.pdf4me/pdf4me)

The Pdf4me Client API is a maven library which connects to its highly scalable SaaS cloud service with many functionalities to solve your document and PDF requirements. The SaaS API provides expert functionality to convert, optimize, compress, produce, merge, split, ocr, enrich, archive, print documents and PDF's.

Feature | Description 
------------ | ------------- 
**Optimize** | PDF's can often be optimized by removing structural redundancy. This leads to much smaller PDF's.
**Merge** | Multiple PDF's can be merged into single optimized PDFs.
**Split** | A PDF can be splitted into multiple PDF's.
**Extract** | From a PDF extract multiple pages into a new document.
**Images** | Extract images from your document, can be any type of document.
**Create Pdf/A** | Create a archive conform PDF/A including xmp Metadata.
**Convert to PDF** | Convert your documents from any format to a proper PDF document.
**Stamp** | Stamp your document with text or images.

## How to add our plugin to your project

Use your favourite build tools to build your project. The depenency information for the various building tools can be found [here](http://search.maven.org/#artifactdetails%7Ccom.pdf4me%7Cpdf4me%7C0.8.0%7Cjar).

## Getting Started

To get started get an Api-Key and Password from our developers page [dev@pdf4me](https://dev-dev.pdf4me.com).

The Api-Key/Password is required to Authenticate with OAuth2. The Pdf4me Client Api provides you already with the necessary implementation. You need only to get an instance for the Pdf4meClient as shown in the sample below.

```java
// Either you store them in the config.properties file with keys clientId and secret
// Do not use any quotes:
// Correct: clientId=sample-not-working-key-aaaaaaa
// Incorrect: clientId="sample-not-working-key-aaaaaaa"
Pdf4meClient pdf4meClient = new Pdf4meClient();

// or you pass them as arguments when constructing the Pdf4meClient object
Pdf4meClient pdf4meClient = new Pdf4meClient(clientId, secret);

// The pdf4meClient object delivers the necessary authentication when instantiating the different pdf4meClients such as for instance Merge
MergeClient mergeClient = new MergeClient(pdf4meClient);
byte[] file1 = Files.readAllBytes(Paths.get("myFirstPdf.pdf"));
byte[] file2 = Files.readAllBytes(Paths.get("mySecondPdf.pdf"));
byte[] mergedPdf = mergeClient.merge2Pdfs(file1, file2);
```

## Documentation

Please visit our [documentation](https://dev-dev.pdf4me.com/) for more information about all the functionalities provided and on how to use pdf4me.


## Recommendation

It's recommended to create an instance of `Pdf4meClient` per thread in a multithreaded environment to avoid any potential issues.