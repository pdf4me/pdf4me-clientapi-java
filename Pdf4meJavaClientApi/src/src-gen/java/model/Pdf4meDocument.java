/*
 * Pdf4me
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import model.DocAction;
import model.DocLog;
import model.DocMetadata;
import model.MergeData;
import model.Page;
import model.ScanPage;

/**
 * Pdf4meDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T11:08:16.145Z")
public class Pdf4meDocument {
  /**
   * Gets or Sets documentType
   */
  @JsonAdapter(DocumentTypeEnum.Adapter.class)
  public enum DocumentTypeEnum {
    UPLOADDOC("uploadDoc"),

    CONVERTED("converted"),

    STAMPED("stamped"),

    OCR("ocr"),

    SPLIT("split"),

    OPTIMIZE("optimize"),

    MERGE("merge");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String text) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DocumentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("documentType")
  private DocumentTypeEnum documentType = null;

  @SerializedName("blobRef")
  private String blobRef = null;

  @SerializedName("jobId")
  private UUID jobId = null;

  @SerializedName("refDocumentId")
  private UUID refDocumentId = null;

  @SerializedName("refDocAction")
  private DocAction refDocAction = null;

  @SerializedName("documentId")
  private UUID documentId = null;

  @SerializedName("docIdExt")
  private String docIdExt = null;

  @SerializedName("userId")
  private UUID userId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("fileExtension")
  private String fileExtension = null;

  @SerializedName("ratio")
  private Double ratio = null;

  /**
   * Gets or Sets docStatus
   */
  @JsonAdapter(DocStatusEnum.Adapter.class)
  public enum DocStatusEnum {
    UNDEF("undef"),

    ERROR("error"),

    FINISHED("finished"),

    UPLOADED("uploaded"),

    LOADING("loading"),

    LOADED("loaded"),

    CONVERTING("converting"),

    CONVERTED("converted"),

    OPTIMIZING("optimizing"),

    OPTIMIZED("optimized"),

    DOINGOCR("doingOcr"),

    OCRED("ocred"),

    DOINGZIP("doingZip"),

    STAMPING("stamping"),

    STAMPED("stamped"),

    PROCESSING("processing"),

    SIGNED("signed");

    private String value;

    DocStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocStatusEnum fromValue(String text) {
      for (DocStatusEnum b : DocStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DocStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DocStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("docStatus")
  private DocStatusEnum docStatus = null;

  @SerializedName("errCode")
  private String errCode = null;

  @SerializedName("errMsg")
  private String errMsg = null;

  @SerializedName("inExecution")
  private Boolean inExecution = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("showDoc")
  private Boolean showDoc = null;

  @SerializedName("docData")
  private byte[] docData = null;

  @SerializedName("thumbnail")
  private byte[] thumbnail = null;

  @SerializedName("pages")
  private List<Page> pages = null;

  @SerializedName("thumbnails")
  private List<byte[]> thumbnails = null;

  @SerializedName("docLogs")
  private List<DocLog> docLogs = null;

  @SerializedName("docMetadata")
  private DocMetadata docMetadata = null;

  @SerializedName("originalDocMetadata")
  private DocMetadata originalDocMetadata = null;

  /**
   * Gets or Sets storageProviderBroker
   */
  @JsonAdapter(StorageProviderBrokerEnum.Adapter.class)
  public enum StorageProviderBrokerEnum {
    UNDEF("undef"),

    KLOUDLESS("kloudless");

    private String value;

    StorageProviderBrokerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StorageProviderBrokerEnum fromValue(String text) {
      for (StorageProviderBrokerEnum b : StorageProviderBrokerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StorageProviderBrokerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageProviderBrokerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StorageProviderBrokerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StorageProviderBrokerEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("storageProviderBroker")
  private StorageProviderBrokerEnum storageProviderBroker = null;

  /**
   * Gets or Sets storageProvider
   */
  @JsonAdapter(StorageProviderEnum.Adapter.class)
  public enum StorageProviderEnum {
    UNDEF("undef"),

    LOCAL("local"),

    URL("url"),

    ONEDRIVE("oneDrive"),

    DROPBOX("dropbox"),

    GOOGLEDRIVE("googleDrive"),

    KLOUDLESS("kloudless");

    private String value;

    StorageProviderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StorageProviderEnum fromValue(String text) {
      for (StorageProviderEnum b : StorageProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StorageProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StorageProviderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StorageProviderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("storageProvider")
  private StorageProviderEnum storageProvider = null;

  @SerializedName("storageAccountId")
  private String storageAccountId = null;

  @SerializedName("storageProviderId")
  private String storageProviderId = null;

  @SerializedName("storageProviderFolderId")
  private String storageProviderFolderId = null;

  @SerializedName("documentUrl")
  private String documentUrl = null;

  @SerializedName("scanPages")
  private List<ScanPage> scanPages = null;

  @SerializedName("allowOCR")
  private Boolean allowOCR = null;

  @SerializedName("mergeData")
  private MergeData mergeData = null;

  @SerializedName("paper")
  private String paper = null;

  /**
   * Gets or Sets printMode
   */
  @JsonAdapter(PrintModeEnum.Adapter.class)
  public enum PrintModeEnum {
    UNDEF("undef"),

    SIMPLEX("simplex"),

    DUPLEX("duplex");

    private String value;

    PrintModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrintModeEnum fromValue(String text) {
      for (PrintModeEnum b : PrintModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrintModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrintModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrintModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrintModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("printMode")
  private PrintModeEnum printMode = null;

  public Pdf4meDocument documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * 
   * @return documentType
   **/
  @ApiModelProperty(value = "")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public Pdf4meDocument blobRef(String blobRef) {
    this.blobRef = blobRef;
    return this;
  }

  /**
   * Get blobRef
   * 
   * @return blobRef
   **/
  @ApiModelProperty(value = "")
  public String getBlobRef() {
    return blobRef;
  }

  public void setBlobRef(String blobRef) {
    this.blobRef = blobRef;
  }

  public Pdf4meDocument jobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * 
   * @return jobId
   **/
  @ApiModelProperty(value = "")
  public UUID getJobId() {
    return jobId;
  }

  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }

  public Pdf4meDocument refDocumentId(UUID refDocumentId) {
    this.refDocumentId = refDocumentId;
    return this;
  }

  /**
   * Get refDocumentId
   * 
   * @return refDocumentId
   **/
  @ApiModelProperty(value = "")
  public UUID getRefDocumentId() {
    return refDocumentId;
  }

  public void setRefDocumentId(UUID refDocumentId) {
    this.refDocumentId = refDocumentId;
  }

  public Pdf4meDocument refDocAction(DocAction refDocAction) {
    this.refDocAction = refDocAction;
    return this;
  }

  /**
   * Get refDocAction
   * 
   * @return refDocAction
   **/
  @ApiModelProperty(value = "")
  public DocAction getRefDocAction() {
    return refDocAction;
  }

  public void setRefDocAction(DocAction refDocAction) {
    this.refDocAction = refDocAction;
  }

  public Pdf4meDocument documentId(UUID documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * 
   * @return documentId
   **/
  @ApiModelProperty(value = "")
  public UUID getDocumentId() {
    return documentId;
  }

  public void setDocumentId(UUID documentId) {
    this.documentId = documentId;
  }

  public Pdf4meDocument docIdExt(String docIdExt) {
    this.docIdExt = docIdExt;
    return this;
  }

  /**
   * Get docIdExt
   * 
   * @return docIdExt
   **/
  @ApiModelProperty(value = "")
  public String getDocIdExt() {
    return docIdExt;
  }

  public void setDocIdExt(String docIdExt) {
    this.docIdExt = docIdExt;
  }

  public Pdf4meDocument userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * 
   * @return userId
   **/
  @ApiModelProperty(value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public Pdf4meDocument name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * 
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pdf4meDocument fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * 
   * @return fileName
   **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Pdf4meDocument fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * Get fileExtension
   * 
   * @return fileExtension
   **/
  @ApiModelProperty(value = "")
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public Pdf4meDocument ratio(Double ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * 
   * @return ratio
   **/
  @ApiModelProperty(value = "")
  public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }

  public Pdf4meDocument docStatus(DocStatusEnum docStatus) {
    this.docStatus = docStatus;
    return this;
  }

  /**
   * Get docStatus
   * 
   * @return docStatus
   **/
  @ApiModelProperty(value = "")
  public DocStatusEnum getDocStatus() {
    return docStatus;
  }

  public void setDocStatus(DocStatusEnum docStatus) {
    this.docStatus = docStatus;
  }

  public Pdf4meDocument errCode(String errCode) {
    this.errCode = errCode;
    return this;
  }

  /**
   * Get errCode
   * 
   * @return errCode
   **/
  @ApiModelProperty(value = "")
  public String getErrCode() {
    return errCode;
  }

  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  public Pdf4meDocument errMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }

  /**
   * Get errMsg
   * 
   * @return errMsg
   **/
  @ApiModelProperty(value = "")
  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  public Pdf4meDocument inExecution(Boolean inExecution) {
    this.inExecution = inExecution;
    return this;
  }

  /**
   * Get inExecution
   * 
   * @return inExecution
   **/
  @ApiModelProperty(value = "")
  public Boolean isInExecution() {
    return inExecution;
  }

  public void setInExecution(Boolean inExecution) {
    this.inExecution = inExecution;
  }

  public Pdf4meDocument order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * 
   * @return order
   **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Pdf4meDocument showDoc(Boolean showDoc) {
    this.showDoc = showDoc;
    return this;
  }

  /**
   * Get showDoc
   * 
   * @return showDoc
   **/
  @ApiModelProperty(value = "")
  public Boolean isShowDoc() {
    return showDoc;
  }

  public void setShowDoc(Boolean showDoc) {
    this.showDoc = showDoc;
  }

  public Pdf4meDocument docData(byte[] docData) {
    this.docData = docData;
    return this;
  }

  /**
   * Get docData
   * 
   * @return docData
   **/
  @ApiModelProperty(value = "")
  public byte[] getDocData() {
    return docData;
  }

  public void setDocData(byte[] docData) {
    this.docData = docData;
  }

  public Pdf4meDocument thumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * 
   * @return thumbnail
   **/
  @ApiModelProperty(value = "")
  public byte[] getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(byte[] thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Pdf4meDocument pages(List<Page> pages) {
    this.pages = pages;
    return this;
  }

  public Pdf4meDocument addPagesItem(Page pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Page>();
    }
    this.pages.add(pagesItem);
    return this;
  }

  /**
   * Get pages
   * 
   * @return pages
   **/
  @ApiModelProperty(value = "")
  public List<Page> getPages() {
    return pages;
  }

  public void setPages(List<Page> pages) {
    this.pages = pages;
  }

  public Pdf4meDocument thumbnails(List<byte[]> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }

  public Pdf4meDocument addThumbnailsItem(byte[] thumbnailsItem) {
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<byte[]>();
    }
    this.thumbnails.add(thumbnailsItem);
    return this;
  }

  /**
   * Get thumbnails
   * 
   * @return thumbnails
   **/
  @ApiModelProperty(value = "")
  public List<byte[]> getThumbnails() {
    return thumbnails;
  }

  public void setThumbnails(List<byte[]> thumbnails) {
    this.thumbnails = thumbnails;
  }

  public Pdf4meDocument docLogs(List<DocLog> docLogs) {
    this.docLogs = docLogs;
    return this;
  }

  public Pdf4meDocument addDocLogsItem(DocLog docLogsItem) {
    if (this.docLogs == null) {
      this.docLogs = new ArrayList<DocLog>();
    }
    this.docLogs.add(docLogsItem);
    return this;
  }

  /**
   * Get docLogs
   * 
   * @return docLogs
   **/
  @ApiModelProperty(value = "")
  public List<DocLog> getDocLogs() {
    return docLogs;
  }

  public void setDocLogs(List<DocLog> docLogs) {
    this.docLogs = docLogs;
  }

  public Pdf4meDocument docMetadata(DocMetadata docMetadata) {
    this.docMetadata = docMetadata;
    return this;
  }

  /**
   * Get docMetadata
   * 
   * @return docMetadata
   **/
  @ApiModelProperty(value = "")
  public DocMetadata getDocMetadata() {
    return docMetadata;
  }

  public void setDocMetadata(DocMetadata docMetadata) {
    this.docMetadata = docMetadata;
  }

  public Pdf4meDocument originalDocMetadata(DocMetadata originalDocMetadata) {
    this.originalDocMetadata = originalDocMetadata;
    return this;
  }

  /**
   * Get originalDocMetadata
   * 
   * @return originalDocMetadata
   **/
  @ApiModelProperty(value = "")
  public DocMetadata getOriginalDocMetadata() {
    return originalDocMetadata;
  }

  public void setOriginalDocMetadata(DocMetadata originalDocMetadata) {
    this.originalDocMetadata = originalDocMetadata;
  }

  public Pdf4meDocument storageProviderBroker(StorageProviderBrokerEnum storageProviderBroker) {
    this.storageProviderBroker = storageProviderBroker;
    return this;
  }

  /**
   * Get storageProviderBroker
   * 
   * @return storageProviderBroker
   **/
  @ApiModelProperty(value = "")
  public StorageProviderBrokerEnum getStorageProviderBroker() {
    return storageProviderBroker;
  }

  public void setStorageProviderBroker(StorageProviderBrokerEnum storageProviderBroker) {
    this.storageProviderBroker = storageProviderBroker;
  }

  public Pdf4meDocument storageProvider(StorageProviderEnum storageProvider) {
    this.storageProvider = storageProvider;
    return this;
  }

  /**
   * Get storageProvider
   * 
   * @return storageProvider
   **/
  @ApiModelProperty(value = "")
  public StorageProviderEnum getStorageProvider() {
    return storageProvider;
  }

  public void setStorageProvider(StorageProviderEnum storageProvider) {
    this.storageProvider = storageProvider;
  }

  public Pdf4meDocument storageAccountId(String storageAccountId) {
    this.storageAccountId = storageAccountId;
    return this;
  }

  /**
   * Get storageAccountId
   * 
   * @return storageAccountId
   **/
  @ApiModelProperty(value = "")
  public String getStorageAccountId() {
    return storageAccountId;
  }

  public void setStorageAccountId(String storageAccountId) {
    this.storageAccountId = storageAccountId;
  }

  public Pdf4meDocument storageProviderId(String storageProviderId) {
    this.storageProviderId = storageProviderId;
    return this;
  }

  /**
   * Get storageProviderId
   * 
   * @return storageProviderId
   **/
  @ApiModelProperty(value = "")
  public String getStorageProviderId() {
    return storageProviderId;
  }

  public void setStorageProviderId(String storageProviderId) {
    this.storageProviderId = storageProviderId;
  }

  public Pdf4meDocument storageProviderFolderId(String storageProviderFolderId) {
    this.storageProviderFolderId = storageProviderFolderId;
    return this;
  }

  /**
   * Get storageProviderFolderId
   * 
   * @return storageProviderFolderId
   **/
  @ApiModelProperty(value = "")
  public String getStorageProviderFolderId() {
    return storageProviderFolderId;
  }

  public void setStorageProviderFolderId(String storageProviderFolderId) {
    this.storageProviderFolderId = storageProviderFolderId;
  }

  public Pdf4meDocument documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  /**
   * Get documentUrl
   * 
   * @return documentUrl
   **/
  @ApiModelProperty(value = "")
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public Pdf4meDocument scanPages(List<ScanPage> scanPages) {
    this.scanPages = scanPages;
    return this;
  }

  public Pdf4meDocument addScanPagesItem(ScanPage scanPagesItem) {
    if (this.scanPages == null) {
      this.scanPages = new ArrayList<ScanPage>();
    }
    this.scanPages.add(scanPagesItem);
    return this;
  }

  /**
   * Get scanPages
   * 
   * @return scanPages
   **/
  @ApiModelProperty(value = "")
  public List<ScanPage> getScanPages() {
    return scanPages;
  }

  public void setScanPages(List<ScanPage> scanPages) {
    this.scanPages = scanPages;
  }

  public Pdf4meDocument allowOCR(Boolean allowOCR) {
    this.allowOCR = allowOCR;
    return this;
  }

  /**
   * Get allowOCR
   * 
   * @return allowOCR
   **/
  @ApiModelProperty(value = "")
  public Boolean isAllowOCR() {
    return allowOCR;
  }

  public void setAllowOCR(Boolean allowOCR) {
    this.allowOCR = allowOCR;
  }

  public Pdf4meDocument mergeData(MergeData mergeData) {
    this.mergeData = mergeData;
    return this;
  }

  /**
   * Get mergeData
   * 
   * @return mergeData
   **/
  @ApiModelProperty(value = "")
  public MergeData getMergeData() {
    return mergeData;
  }

  public void setMergeData(MergeData mergeData) {
    this.mergeData = mergeData;
  }

  public Pdf4meDocument paper(String paper) {
    this.paper = paper;
    return this;
  }

  /**
   * Get paper
   * 
   * @return paper
   **/
  @ApiModelProperty(value = "")
  public String getPaper() {
    return paper;
  }

  public void setPaper(String paper) {
    this.paper = paper;
  }

  public Pdf4meDocument printMode(PrintModeEnum printMode) {
    this.printMode = printMode;
    return this;
  }

  /**
   * Get printMode
   * 
   * @return printMode
   **/
  @ApiModelProperty(value = "")
  public PrintModeEnum getPrintMode() {
    return printMode;
  }

  public void setPrintMode(PrintModeEnum printMode) {
    this.printMode = printMode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pdf4meDocument pdf4meDocument = (Pdf4meDocument) o;
    return Objects.equals(this.documentType, pdf4meDocument.documentType)
        && Objects.equals(this.blobRef, pdf4meDocument.blobRef) && Objects.equals(this.jobId, pdf4meDocument.jobId)
        && Objects.equals(this.refDocumentId, pdf4meDocument.refDocumentId)
        && Objects.equals(this.refDocAction, pdf4meDocument.refDocAction)
        && Objects.equals(this.documentId, pdf4meDocument.documentId)
        && Objects.equals(this.docIdExt, pdf4meDocument.docIdExt) && Objects.equals(this.userId, pdf4meDocument.userId)
        && Objects.equals(this.name, pdf4meDocument.name) && Objects.equals(this.fileName, pdf4meDocument.fileName)
        && Objects.equals(this.fileExtension, pdf4meDocument.fileExtension)
        && Objects.equals(this.ratio, pdf4meDocument.ratio) && Objects.equals(this.docStatus, pdf4meDocument.docStatus)
        && Objects.equals(this.errCode, pdf4meDocument.errCode) && Objects.equals(this.errMsg, pdf4meDocument.errMsg)
        && Objects.equals(this.inExecution, pdf4meDocument.inExecution)
        && Objects.equals(this.order, pdf4meDocument.order) && Objects.equals(this.showDoc, pdf4meDocument.showDoc)
        && Arrays.equals(this.docData, pdf4meDocument.docData)
        && Arrays.equals(this.thumbnail, pdf4meDocument.thumbnail) && Objects.equals(this.pages, pdf4meDocument.pages)
        && Objects.equals(this.thumbnails, pdf4meDocument.thumbnails)
        && Objects.equals(this.docLogs, pdf4meDocument.docLogs)
        && Objects.equals(this.docMetadata, pdf4meDocument.docMetadata)
        && Objects.equals(this.originalDocMetadata, pdf4meDocument.originalDocMetadata)
        && Objects.equals(this.storageProviderBroker, pdf4meDocument.storageProviderBroker)
        && Objects.equals(this.storageProvider, pdf4meDocument.storageProvider)
        && Objects.equals(this.storageAccountId, pdf4meDocument.storageAccountId)
        && Objects.equals(this.storageProviderId, pdf4meDocument.storageProviderId)
        && Objects.equals(this.storageProviderFolderId, pdf4meDocument.storageProviderFolderId)
        && Objects.equals(this.documentUrl, pdf4meDocument.documentUrl)
        && Objects.equals(this.scanPages, pdf4meDocument.scanPages)
        && Objects.equals(this.allowOCR, pdf4meDocument.allowOCR)
        && Objects.equals(this.mergeData, pdf4meDocument.mergeData) && Objects.equals(this.paper, pdf4meDocument.paper)
        && Objects.equals(this.printMode, pdf4meDocument.printMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, blobRef, jobId, refDocumentId, refDocAction, documentId, docIdExt, userId, name,
        fileName, fileExtension, ratio, docStatus, errCode, errMsg, inExecution, order, showDoc,
        Arrays.hashCode(docData), Arrays.hashCode(thumbnail), pages, thumbnails, docLogs, docMetadata,
        originalDocMetadata, storageProviderBroker, storageProvider, storageAccountId, storageProviderId,
        storageProviderFolderId, documentUrl, scanPages, allowOCR, mergeData, paper, printMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pdf4meDocument {\n");

    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    blobRef: ").append(toIndentedString(blobRef)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    refDocumentId: ").append(toIndentedString(refDocumentId)).append("\n");
    sb.append("    refDocAction: ").append(toIndentedString(refDocAction)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    docIdExt: ").append(toIndentedString(docIdExt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    docStatus: ").append(toIndentedString(docStatus)).append("\n");
    sb.append("    errCode: ").append(toIndentedString(errCode)).append("\n");
    sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
    sb.append("    inExecution: ").append(toIndentedString(inExecution)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    showDoc: ").append(toIndentedString(showDoc)).append("\n");
    sb.append("    docData: ").append(toIndentedString(docData)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    docLogs: ").append(toIndentedString(docLogs)).append("\n");
    sb.append("    docMetadata: ").append(toIndentedString(docMetadata)).append("\n");
    sb.append("    originalDocMetadata: ").append(toIndentedString(originalDocMetadata)).append("\n");
    sb.append("    storageProviderBroker: ").append(toIndentedString(storageProviderBroker)).append("\n");
    sb.append("    storageProvider: ").append(toIndentedString(storageProvider)).append("\n");
    sb.append("    storageAccountId: ").append(toIndentedString(storageAccountId)).append("\n");
    sb.append("    storageProviderId: ").append(toIndentedString(storageProviderId)).append("\n");
    sb.append("    storageProviderFolderId: ").append(toIndentedString(storageProviderFolderId)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    scanPages: ").append(toIndentedString(scanPages)).append("\n");
    sb.append("    allowOCR: ").append(toIndentedString(allowOCR)).append("\n");
    sb.append("    mergeData: ").append(toIndentedString(mergeData)).append("\n");
    sb.append("    paper: ").append(toIndentedString(paper)).append("\n");
    sb.append("    printMode: ").append(toIndentedString(printMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
