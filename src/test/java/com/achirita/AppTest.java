package com.achirita;

import com.worldpay.sop.accelerator.ApiClient;
import com.worldpay.sop.accelerator.ResponseSpecBuilders;
import com.worldpay.sop.accelerator.model.ServiceResponse;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.Test;

import java.util.function.Supplier;

public class AppTest
{
    @Test
    public void test()
    {
        ApiClient.Config config = new ApiClient.Config();
        config.reqSpecSupplier(() -> new RequestSpecBuilder());

        ApiClient client = ApiClient.api(config);

        ServiceResponse response = client.helloWorld()
                .sayHello()
                .versionPath("v2.0")
                .executeAs(ResponseSpecBuilders.validatedWith(ResponseSpecBuilders.shouldBeCode(200)));

        System.out.println(response);
    }
}
