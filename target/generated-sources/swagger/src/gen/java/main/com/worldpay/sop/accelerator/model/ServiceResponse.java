/*
 * SOP Accelerator API
 * SOP Accelerator API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.worldpay.sop.accelerator.model;

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

/**
 * Custom response object for the SOP Accelerator project.
 */
@ApiModel(description = "Custom response object for the SOP Accelerator project.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-01T12:57:42.687+02:00")
public class ServiceResponse {
  @SerializedName("message")
  private String message = "Hello World!";

  @SerializedName("additionalMessage")
  private String additionalMessage = null;

  public ServiceResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Simple response message.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Simple response message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ServiceResponse additionalMessage(String additionalMessage) {
    this.additionalMessage = additionalMessage;
    return this;
  }

   /**
   * Second message returned in the response payload to differentiate between versioned fields.
   * @return additionalMessage
  **/
  @ApiModelProperty(required = true, value = "Second message returned in the response payload to differentiate between versioned fields.")
  public String getAdditionalMessage() {
    return additionalMessage;
  }

  public void setAdditionalMessage(String additionalMessage) {
    this.additionalMessage = additionalMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceResponse serviceResponse = (ServiceResponse) o;
    return Objects.equals(this.message, serviceResponse.message) &&
        Objects.equals(this.additionalMessage, serviceResponse.additionalMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, additionalMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    additionalMessage: ").append(toIndentedString(additionalMessage)).append("\n");
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
