package in.ineuron.persistent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReplaceRegistrationCodes {
    public static void main(String[] args) throws Exception {
        String bprsRegistrationMap = "ATBE:All Tenants by Entirety,CP:Community Property,CPWRS:Community Property with Rights of Survivorship,CPWDB:Community Property with Designated Beneficiary,CU:Custodial,DBIN:Designated Beneficiary - Individual,DBJT:Designated Beneficiary - Joint,IN:Individual,JT:Joint Tenants,LFTEN:Life Tenancy,TC:Tenants in Common,TT:Testamentary Trust,USUF:Usufructory,CORP:Corporate,LLC:Limited Liability Company,PA:Partnership,SP:Sole Proprietorship,CO:Contributory IRA,IHIRA:Inherited IRA,IHIRH:Inherited Roth IRA,IHNSI:Inherited IRA from Qualified Plan,IHNSR:Inherited Roth IRA from Qualified Plan,RO:Rollover IRA,RH:Roth IRA,RV:Roth Conversion IRA,IND:Individual,TEN:Tenant,SPOUS:Spouse,LT:Living Trust,TTEE:Trustee";

        String json = "[\n" +
                "  {\n" +
                "    \"dateTimeStamp\": \"2025-06-04 13:57:52\",\n" +
                "    \"customerNumber\": null,\n" +
                "    \"accountNumber\": \"123451234\",\n" +
                "    \"accountName\": null,\n" +
                "    \"productType\": null,\n" +
                "    \"registration\": \"ATBE\",\n" +
                "    \"role\": null,\n" +
                "    \"clientEnterpriseCode\": null,\n" +
                "    \"totalBalance\": null,\n" +
                "    \"eligibleBalance\": null,\n" +
                "    \"reasonMessage\": \"Account Not Found\",\n" +
                "    \"acctEligibleToPlgd\": false,\n" +
                "    \"acctEligibleBalCalc\": false\n" +
                "  },\n" +
                "  {\n" +
                "    \"dateTimeStamp\": \"2025-06-04 13:57:52\",\n" +
                "    \"customerNumber\": null,\n" +
                "    \"accountNumber\": \"123451234\",\n" +
                "    \"accountName\": null,\n" +
                "    \"productType\": null,\n" +
                "    \"registration\": \"USUF\",\n" +
                "    \"role\": null,\n" +
                "    \"clientEnterpriseCode\": null,\n" +
                "    \"totalBalance\": null,\n" +
                "    \"eligibleBalance\": null,\n" +
                "    \"reasonMessage\": \"Account Not Found\",\n" +
                "    \"acctEligibleToPlgd\": false,\n" +
                "    \"acctEligibleBalCalc\": false\n" +
                "  }\n" +
                "]";

        // Convert the bprsRegistrationMap to a real Map
        Map<String, String> regMap = new HashMap<>();
        for (String entry : bprsRegistrationMap.split(",")) {
            String[] parts = entry.split(":", 2);
            regMap.put(parts[0], parts[1]);
        }

        // Use Jackson to parse JSON
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> records = mapper.readValue(json, new TypeReference<List<Map<String, Object>>>() {});

        // Replace registration code with full name
        for (Map<String, Object> record : records) {
            String code = (String) record.get("registration");
            if (code != null && regMap.containsKey(code)) {
                record.put("registration", regMap.get(code));
            }
        }

        // Print updated JSON
        String updatedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(records);
        System.out.println(updatedJson);
    }
}

