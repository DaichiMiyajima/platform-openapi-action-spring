/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.miyajima.trial01.api;

import com.miyajima.trial01.model.Doc;
import com.miyajima.trial01.model.Error;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-18T12:02:18.861388298Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
@Validated
@Tag(name = "docs", description = "the docs API")
public interface DocsApi {

    /**
     * GET /docs : List all docs
     *
     * @param limit How many items to return at one time (max 102) (optional)
     * @return A paged array of docs (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "listDocs",
        summary = "List all docs",
        tags = { "docs" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A paged array of docs", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Doc.class)))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/docs",
        produces = { "application/json" }
    )
    
    ResponseEntity<List<Doc>> listDocs(
        @Parameter(name = "limit", description = "How many items to return at one time (max 102)", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit
    );


    /**
     * GET /docs/{docId} : Info for a specific doc
     *
     * @param docId The id of the doc to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "showDocById",
        summary = "Info for a specific doc",
        tags = { "docs" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Doc.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/docs/{docId}",
        produces = { "application/json" }
    )
    
    ResponseEntity<Doc> showDocById(
        @Parameter(name = "docId", description = "The id of the doc to retrieve", required = true, in = ParameterIn.PATH) @PathVariable("docId") String docId
    );

}
