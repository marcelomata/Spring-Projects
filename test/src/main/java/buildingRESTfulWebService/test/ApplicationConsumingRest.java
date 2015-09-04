//package buildingRESTfulWebService.test;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.client.RestTemplate;
//
//import buildingRESTfulWebService.test.hello.Quote;
//
//@SpringBootApplication
//public class ApplicationConsumingRest implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(ApplicationConsumingRest.class);
//
//    public static void main(String args[]) {
//        SpringApplication.run(ApplicationConsumingRest.class);
//    }
//
//    @Override
//    public void run(String... strings) throws Exception {
//        String url = "http://gturnquist-quoters.cfapps.io/api/random";
//        
//        RestTemplate restTemplate = new RestTemplate();
//        Quote quote = restTemplate.getForObject(url, Quote.class);
//        log.info(quote.toString());
//    }
//}