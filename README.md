# spring-boot-itext-pdf
Creating PDF with Java and iText

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations.

#### Prerequisites

- Java 8
- Maven > 3.0

#### Using the terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

### Usage

- Launch the application and go on http://localhost:8080/
- Take a look to console output: you should see some log from 
  `com.boot.application.app.controllers.PdfController.java`
- Optional: if you setted a log file in the `application.properties` open such file to see the log


# 1. Overview
iText is a Java library originally created by Bruno Lowagie which allows to create PDF, read PDF and manipulate them. The following tutorial will show how to create PDF files with iText. This tutorial assumes that you have basis Java and Eclipse knowledge.

iText has a hierarchical structure. The smallest text unit is a "Chunk" which is a String with a pre-defined font. A "Phrase" combines several Chunks and allows to define line spacing. "Paragraph" is a subclass of "Phrase" and allows to define more layout attributes, e.g. margins. The class "Anchor" is a subclass of "Paragraph" and serves as the basis for hyperlinks in the generated PDF.
