package com;

/**
 * Created by qixin on 2018/1/21.
 */
//@RestController
//@Configuration
public class Controller {
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplet() {
//        return new RestTemplate();
//    }
//
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @GetMapping("/router")
//    public String invoke() {
//        return getRestTemplet().getForObject("http://provider/person/1", String.class);
////        List<String> services = discoveryClient.getServices();
////        for(String service : services) {
////            System.out.println(service);
////        }
//
////        return "";
//    }
//
//    @GetMapping("/router1")
//    public String metaData() {
//        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("provider");
//        for(ServiceInstance service : serviceInstances) {
//            System.out.println(service.getMetadata().get("company-name"));
//        }
//        return "";
//    }
}
