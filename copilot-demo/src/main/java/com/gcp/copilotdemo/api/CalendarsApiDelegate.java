package com.gcp.copilotdemo.api;

import com.gcp.copilotdemo.model.CalendarDayModel;
import com.gcp.copilotdemo.model.CurrencyModel;
import java.time.LocalDate;
import com.gcp.copilotdemo.model.NextSettlementDayModel;
import com.gcp.copilotdemo.util.ApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link CalendarsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-13T12:08:29.158795400+05:30[Asia/Calcutta]")
public interface CalendarsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /calendar/next : Obtain the next available settlement date
     * Returns the next settlement date for a given planned date, currency, and payment method.
     *
     * @param paymentMethod The payment method (required)
     * @param plannedDate The date for the proposed payment (required)
     * @param currency The settlement currency (required)
     * @return Success (status code 200)
     *         or Errors occurred (status code 400)
     *         or Forbidden (status code 403)
     * @see CalendarsApi#getNextSettlementDate
     */
    default ResponseEntity<NextSettlementDayModel> getNextSettlementDate(String paymentMethod,
        LocalDate plannedDate,
        CurrencyModel currency) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"nextSettlementDate\" : \"2022-12-31T00:00:00.000+0000\", \"currency\" : \"NOK\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /calendar/{date} : the GET method for a single calendar day
     * Retrieve a calendar day for display or update
     *
     * @param date the unique resource identifier for the document (required)
     * @return single calendar entry (status code 200)
     *         or Forbidden (status code 403)
     *         or Method Not Found (status code 405)
     * @see CalendarsApi#getSettlementCalendarByDate
     */
    default ResponseEntity<CalendarDayModel> getSettlementCalendarByDate(LocalDate date) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"audit\" : { \"at\" : \"2021-03-03T08:24:51Z\", \"user\" : \"svc99\" }, \"calendarDate\" : \"2022-12-31T00:00:00.000+0000\", \"currencies\" : \"[\n {\n 'currency': 'AUD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'CAD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'CHF',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'DKK',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'EUR',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'GBP',\n 'stfoSettlementAllowed': false,\n 'swiftSettlementAllowed': false\n },\n {\n 'currency': 'HKD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'JPY',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'NOK',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'NZD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'SEK',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'SGD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'USD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'ZAR',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n }\n]\n\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /calendar/{date} : the PUT method for a single calendar day
     * Updates a calendar day record
     *
     * @param date the unique resource identifier for the document (required)
     * @param ifMatch an optimistic lock token respresenting the resource state; usually a hex-encoded MD5 hash value. Obtained from the &#x60;Etag&#x60; response header of a previous GET request for the resource. (required)
     * @param calendarDayModel  (optional)
     * @return calendar entry updated (status code 200)
     *         or Errors occurred (status code 400)
     *         or Forbidden (status code 403)
     *         or Conflict - the &#x60;If-Match&#x60; value supplied on the request does not match the current &#x60;Etag&#x60; of the record (status code 409)
     * @see CalendarsApi#updateSettlementCalendarDay
     */
    default ResponseEntity<CalendarDayModel> updateSettlementCalendarDay(LocalDate date,
        String ifMatch,
        CalendarDayModel calendarDayModel) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"audit\" : { \"at\" : \"2021-03-03T08:24:51Z\", \"user\" : \"svc99\" }, \"calendarDate\" : \"2022-12-31T00:00:00.000+0000\", \"currencies\" : \"[\n {\n 'currency': 'AUD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'CAD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'CHF',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'DKK',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'EUR',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'GBP',\n 'stfoSettlementAllowed': false,\n 'swiftSettlementAllowed': false\n },\n {\n 'currency': 'HKD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'JPY',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'NOK',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'NZD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'SEK',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'SGD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'USD',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n },\n {\n 'currency': 'ZAR',\n 'stfoSettlementAllowed': true,\n 'swiftSettlementAllowed': true\n }\n]\n\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
