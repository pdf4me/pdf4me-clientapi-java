# Pdf4me.Client - the java library for the Pdf4me Saas API



![Maven Central](https://img.shields.io/maven-central/v/com.pdf4me/pdf4me.svg) ![license](https://img.shields.io/github/license/mashape/apistatus.svg) ![Maintenance](https://img.shields.io/maintenance/yes/2018.svg) ![Build](https://ynoox.visualstudio.com/_apis/public/build/definitions/2e29c2f0-3f4a-40e1-a4b1-1cc465571206/289/badge)



The [Pdf4me Client API](https://developer.pdf4me.com/docs/api/getting-started/) is a maven library which connects to its highly scalable SaaS cloud service with many functionalities to solve your document and PDF requirements. The SaaS API provides expert functionality to convert, optimize, compress, produce, merge, split, ocr, enrich, archive, print documents and PDF's.

Feature | Description 
------------ | ------------- 
[**Optimize**](https://developer.pdf4me.com/docs/api/basic-functionality/optimize/) | PDF's can often be optimized by removing structural redundancy. This leads to much smaller PDF's
[**Merge**](https://developer.pdf4me.com/docs/api/basic-functionality/merge-pdfs/) | Multiple PDF's can be merged into single optimized PDFs.
[**Split**](https://developer.pdf4me.com/docs/api/basic-functionality/split-pdf/) | A PDF can be splitted into multiple PDF's.
[**Convert to PDF**](https://developer.pdf4me.com/docs/api/basic-functionality/convert-to-pdf/) | Convert your documents from any format to a proper PDF document.
[**Extract**](https://developer.pdf4me.com/docs/api/basic-functionality/extract-pdf/) | From a PDF extract multiple pages into a new document.
[**Images**](https://developer.pdf4me.com/docs/api/basic-functionality/create-image/) | Extract images from your document, can be any type of document.
[**Create Pdf/A**](https://developer.pdf4me.com/docs/api/basic-functionality/pdfa/) | Create a archive conform PDF/A including xmp Metadata.
[**Stamp**](https://developer.pdf4me.com/docs/api/basic-functionality/stamp/) | Stamp your document with text or images.

## How to add our plugin to your project

Use your favourite build tools to build your project. The depenency information for the various building tools can be found [here](http://search.maven.org/#artifactdetails%7Ccom.pdf4me%7Cpdf4me).

## Getting Started

To get started get a Token by dropping us an [email](mailto:support-dev@pdf4me.com) or registering in our [portal](https://portal.pdf4me.com/).

The Token is required for Basic Authentication. The Pdf4me Client Api provides you already with the necessary implementation. You need only to get an instance for the Pdf4meClient as shown in the sample below.


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

Please visit our [documentation]() for more information about all the functionalities provided and on how to use pdf4me.

## Recommendation

It's recommended to create an instance of `Pdf4meClient` per thread in a multithreaded environment to avoid any potential issues.

## Contribution

Contributions are very welcome. Please have a look at the instructions below for a smooth project setup.

1. Fork pdf4me
2. Clone your copy of pdf4me
3. Start your IDE, e.g., Eclipse
4. Import the two projects: In Eclipse: click on *File* in the menu -> *Import...* -> Choose the *Maven* folder -> *Existing Maven Projects*
> - import Pdf4meJavaClientApi
> - import Pdf4meJavaClientApiTest
5. You are ready to go

#### Running the Test Cases
In order for the test cases to run, a config.properties file containing the clientId and secret must be stored in the Pdf4meJavaClientApiTest folder. Please drop us an email (support-dev@pdf4me.com), so we can provide you the developer (clientId, secret) pair for testing the code of your pull request.
The test cases are found in Pdf4meJavaClientApiTest/src/test/java/jUnit.

#### PDF4me Consumer
Those who are looking for PDF4me online tool can find it at [PDF4me.com](https://pdf4me.com/)
