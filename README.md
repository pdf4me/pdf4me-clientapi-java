# Pdf4me.Client - the java library for the Pdf4me Saas API
---

The Pdf4me Client API is a maven library which connects to its highly scalable SaaS cloud service with many functionalities to solve your document and PDF requirements. The SaaS API provides expert functionality to convert, optimize, compress, produce, merge, split, ocr, enrich, archive, print documents and PDF's.

Feature | Description 
------------ | ------------- 
[**Optimize**](https://dev-dev.pdf4me.com/#operation/Optimize) | PDF's can often be optimized by removing structural redundancy. This leads to much smaller PDF's.
**Merge** | Multiple PDF's can be merged into single optimized PDFs.
**Split** | A PDF can be splitted into multiple PDF's.
**Extract** | From a PDF extract multiple pages into a new document.
**Images** | Extract images from your document, can be any type of document.
**Create Pdf/A** | Create a archive conform PDF/A including xmp Metadata.
**Convert to PDF** | Convert your documents from any format to a proper PDF document.
**Stamp** | Stamp your document with text or images.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Documentation

To get an idea of how pdf4me could be used, have a look at the example below. The code snippet illustrates how to perform a merge of two PDF files.

```java
// setup the mergeClient
MergeClient mergeClient = new MergeClient(pdf4meClient);

// files
byte[] file1 = Files.readAllBytes(Paths.get("myFirstPdf.pdf"));
byte[] file2 = Files.readAllBytes(Paths.get("mySecondPdf.pdf"));

// merge
byte[] mergedPdf = mergeClient.merge2Pdfs(file1, file2);
```

Please visit our [documentation](https://dev-dev.pdf4me.com/) for more information about all the functionalities provided and on how to use pdf4me.


## Recommendation

It's recommended to create an instance of `Pdf4meClient` per thread in a multithreaded environment to avoid any potential issues.