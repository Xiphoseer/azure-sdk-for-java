// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSet;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetAppResourcesUpdateNetworkSiblingSetMockTests {
    @Test
    public void testUpdateNetworkSiblingSet() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"networkSiblingSetId\":\"vvhmxtdrj\",\"subnetId\":\"tac\",\"networkSiblingSetStateId\":\"bj\",\"networkFeatures\":\"Standard_Basic\",\"provisioningState\":\"Canceled\",\"nicInfoList\":[{\"ipAddress\":\"m\",\"volumeResourceIds\":[\"mguaadraufa\",\"tkahzo\",\"ajjziuxxpshne\",\"kulfg\"]},{\"ipAddress\":\"qubkw\",\"volumeResourceIds\":[\"nrdsutujbazpjuoh\"]}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        NetAppFilesManager manager = NetAppFilesManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkSiblingSet response = manager.netAppResources().updateNetworkSiblingSet("ernntiewdjcvbquw",
            new UpdateNetworkSiblingSetRequest().withNetworkSiblingSetId("behwagohb").withSubnetId("f")
                .withNetworkSiblingSetStateId("kmr").withNetworkFeatures(NetworkFeatures.STANDARD),
            com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vvhmxtdrj", response.networkSiblingSetId());
        Assertions.assertEquals("tac", response.subnetId());
        Assertions.assertEquals("bj", response.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.STANDARD_BASIC, response.networkFeatures());
        Assertions.assertEquals("mguaadraufa", response.nicInfoList().get(0).volumeResourceIds().get(0));
    }
}
