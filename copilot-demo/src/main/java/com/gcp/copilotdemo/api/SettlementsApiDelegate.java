package com.gcp.copilotdemo.api;

import com.gcp.copilotdemo.model.APIResponseModel;
import com.gcp.copilotdemo.model.KeyValuePairModel;
import java.util.List;
import java.time.OffsetDateTime;
import com.gcp.copilotdemo.model.OptionalIdentifiersModel;
import com.gcp.copilotdemo.model.SettlementModel;
import java.util.UUID;

import com.gcp.copilotdemo.util.ApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link settlementsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public interface SettlementsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    APIResponseModel response = new APIResponseModel();

    /**
     * POST /settlement : adds a new settlement
     * Creates a new settlement. All data fields are validated
     *
     * @param settlementModel settlement to be created (required)
     * @return Settlement item created (status code 201)
     * or Errors occurred (status code 400)
     * or Forbidden (status code 403)
     * or an existing duplicate item already exists (status code 409)
     * @see SettlementsApi#createSettlement
     */
    default APIResponseModel createSettlement(SettlementModel settlementModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originatingIdentifiers\" : { \"application\" : \"TREATY\", \"treatyIds\" : { \"brokerId\" : \"666\", \"lineItem\" : \"17\", \"statementId\" : \"s123456\", \"brokerGroupId\" : \"xyz775\", \"treatyId\" : \"123456789\" }, \"premiumIds\" : { \"premiumId\" : \"c1234\" }, \"claimIds\" : { \"claimId\" : \"c1234\" } }, \"exchangeRate\" : 1, \"audit\" : { \"at\" : \"2021-03-03T08:24:51Z\", \"user\" : \"svc99\" }, \"optionalIdentifiers\" : { \"paymentId\" : \"13356f3d-fcff-423b-870f-553fac0675f1\", \"netSettlementId\" : \"d5eecee5-6173-4c94-8e01-26cef1dbde5a\", \"cancellationId\" : \"37e9882a-984f-453e-a676-ed9e841c3150\" }, \"scheduleDate\" : \"2021-08-29T09:12:33.001Z\", \"paymentMethod\" : \"STFO\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"uniqueRef\" : \"77add1d5f41223d5582fca736a5cb335\", \"debit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" }, \"credit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        //return new ResponseEntity<>(HttpStatus.OK);
        return response;
    }

    /**
     * DELETE /settlement/{id} : Delete a settlement record
     * Hard delete of a settlement record. Intended for use only in testing and possibly by applications support staff. Does not check to see if the record has already been aggregated, cancelled or paid. _Caveat emptor..._
     *
     * @param id the unique resource identifier for the settlement (required)
     * @param ifMatch an optimistic lock token respresenting the resource state; usually a hex-encoded MD5 hash value. Obtained from the &#x60;Etag&#x60; response header of a previous GET request for the resource. (required)
     * @return Successful deletion (status code 204)
     *         or Bad Request (status code 400)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Conflict - the &#x60;If-Match&#x60; value supplied on the request does not match the current &#x60;Etag&#x60; of the record (status code 409)
     * @see SettlementsApi#deleteSettlement
     */
    default ResponseEntity<Void> deleteSettlement(UUID id,
        String ifMatch) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /search : Find settlements that meet specific search criteria
     * A flexible search capability. Currently using a POST method due to restrictions in OpenAPI 3.0.0, but this will be deprecated later in favour of a GET with a request body which is allowed at OpenAPI 3.0.3...
     *
     * @param keyValuePairModel Name-value pairs for keyword searches. All search criteria are ANDed together to filter the results (required)
     * @return Success. Note that no matching items (empty array returned) is considered a successful execution. (status code 200)
     *         or Errors occurred (status code 400)
     *         or Forbidden (status code 403)
     * @see SettlementsApi#findSettlements
     */
    default ResponseEntity<List<SettlementModel>> findSettlements(List<KeyValuePairModel> keyValuePairModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originatingIdentifiers\" : { \"application\" : \"TREATY\", \"treatyIds\" : { \"brokerId\" : \"666\", \"lineItem\" : \"17\", \"statementId\" : \"s123456\", \"brokerGroupId\" : \"xyz775\", \"treatyId\" : \"123456789\" }, \"premiumIds\" : { \"premiumId\" : \"c1234\" }, \"claimIds\" : { \"claimId\" : \"c1234\" } }, \"exchangeRate\" : 1, \"audit\" : { \"at\" : \"2021-03-03T08:24:51Z\", \"user\" : \"svc99\" }, \"optionalIdentifiers\" : { \"paymentId\" : \"13356f3d-fcff-423b-870f-553fac0675f1\", \"netSettlementId\" : \"d5eecee5-6173-4c94-8e01-26cef1dbde5a\", \"cancellationId\" : \"37e9882a-984f-453e-a676-ed9e841c3150\" }, \"scheduleDate\" : \"2021-08-29T09:12:33.001Z\", \"paymentMethod\" : \"STFO\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"uniqueRef\" : \"77add1d5f41223d5582fca736a5cb335\", \"debit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" }, \"credit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /search : Find settlements that are eligible for aggregation
     * Finds settlements with the same payment method between two dateTimes, that haven&#39;t already been aggregated. Settlements that have **any** of the optional identifiers will not be included in the returned list, as they have previously been aggregated, paid, or cancelled.
     *
     * @param paymentMethod The payment method. All settlements returned will have this payment method. (required)
     * @param from The exclusive lower bound for selection. All settlements selected will have a &#x60;scheduleDate&#x60; greater than this value. (required)
     * @param to The inclusive upper bound for selection. All settlements selected will have a &#x60;scheduleDate&#x60; less than or equal to this value. (required)
     * @return Success. Note that no matching items (empty array returned) is considered a successful execution. (status code 200)
     *         or Errors occurred (status code 400)
     *         or Forbidden (status code 403)
     * @see SettlementsApi#findSettlementsForAggregation
     */
    default ResponseEntity<List<SettlementModel>> findSettlementsForAggregation(String paymentMethod,
        OffsetDateTime from,
        OffsetDateTime to) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originatingIdentifiers\" : { \"application\" : \"TREATY\", \"treatyIds\" : { \"brokerId\" : \"666\", \"lineItem\" : \"17\", \"statementId\" : \"s123456\", \"brokerGroupId\" : \"xyz775\", \"treatyId\" : \"123456789\" }, \"premiumIds\" : { \"premiumId\" : \"c1234\" }, \"claimIds\" : { \"claimId\" : \"c1234\" } }, \"exchangeRate\" : 1, \"audit\" : { \"at\" : \"2021-03-03T08:24:51Z\", \"user\" : \"svc99\" }, \"optionalIdentifiers\" : { \"paymentId\" : \"13356f3d-fcff-423b-870f-553fac0675f1\", \"netSettlementId\" : \"d5eecee5-6173-4c94-8e01-26cef1dbde5a\", \"cancellationId\" : \"37e9882a-984f-453e-a676-ed9e841c3150\" }, \"scheduleDate\" : \"2021-08-29T09:12:33.001Z\", \"paymentMethod\" : \"STFO\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"uniqueRef\" : \"77add1d5f41223d5582fca736a5cb335\", \"debit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" }, \"credit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /settlement/{id} : returns a single settlement by ID
     * Retrieve a settlement by its unique identifier
     *
     * @param id the unique resource identifier for the document (required)
     * @return single settlement (status code 200)
     * or Forbidden (status code 403)
     * or Not Found (status code 404)
     * or Method Not Allowed (status code 405)
     * @see SettlementsApi#getSettlementById
     */
    default APIResponseModel getSettlementById(UUID id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"originatingIdentifiers\" : { \"application\" : \"TREATY\", \"treatyIds\" : { \"brokerId\" : \"666\", \"lineItem\" : \"17\", \"statementId\" : \"s123456\", \"brokerGroupId\" : \"xyz775\", \"treatyId\" : \"123456789\" }, \"premiumIds\" : { \"premiumId\" : \"c1234\" }, \"claimIds\" : { \"claimId\" : \"c1234\" } }, \"exchangeRate\" : 1, \"audit\" : { \"at\" : \"2021-03-03T08:24:51Z\", \"user\" : \"svc99\" }, \"optionalIdentifiers\" : { \"paymentId\" : \"13356f3d-fcff-423b-870f-553fac0675f1\", \"netSettlementId\" : \"d5eecee5-6173-4c94-8e01-26cef1dbde5a\", \"cancellationId\" : \"37e9882a-984f-453e-a676-ed9e841c3150\" }, \"scheduleDate\" : \"2021-08-29T09:12:33.001Z\", \"paymentMethod\" : \"STFO\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"uniqueRef\" : \"77add1d5f41223d5582fca736a5cb335\", \"debit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" }, \"credit\" : { \"amount\" : 2999.99, \"accountIdentifier\" : \"GB33BUKB20201555555556\", \"currency\" : \"NOK\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        //return new ResponseEntity<>(HttpStatus.OK);
        return response;

    }

    /**
     * POST /settlement/{id} : Mark a settlement as paid, aggregated, or cancelled
     * Allows a &#x60;netSettlementId&#x60;, &#x60;paymentId&#x60;, or &#x60;cancellationId&#x60; to be added to a settlement. Once an ID has been added, it cannot be updated or removed. Settlements that already have either a &#x60;netSettlementId&#x60; or &#x60;paymentId&#x60; cannot be cancelled by giving them a &#x60;cancellationId&#x60;. You can add a &#x60;netSettlementId&#x60; and a &#x60;paymentId&#x60; together in the same call if you wish.
     *
     * @param id                       the unique resource identifier for the document (required)
     * @param optionalIdentifiersModel identifier(s) to be added (required)
     * @return the attribute(s) requested have been added to the record (status code 200)
     * or Errors occurred (status code 400)
     * or Forbidden (status code 403)
     * or Errors occurred (status code 409)
     * @see SettlementsApi#markSettlement
     */
    default APIResponseModel markSettlement(UUID id, OptionalIdentifiersModel optionalIdentifiersModel) {
        // return new ResponseEntity<>(HttpStatus.OK);
        return response;

    }

}
