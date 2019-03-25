import org.springframework.cloud.contract.spec.Contract
Contract.make {
    description "should return even when number input is even"
    request{
        method GET()
        url("/message") {

        }
    }
    response {
        body("Hello world")
        status 200
    }
}
