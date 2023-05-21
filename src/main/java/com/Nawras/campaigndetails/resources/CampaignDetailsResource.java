package com.Nawras.campaigndetails.resources;


import com.Nawras.campaigndetails.models.Campaign;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CampaignDetailsResource {
    private static final String LISTING_DETAILS_CSV_FILE_PATH = "src/main/resources/listing-details.csv";

    @RequestMapping(value = "/listings", method = RequestMethod.GET)
    public List<Campaign> getCampaignDetails(@RequestParam Double min_price, @RequestParam Double max_price, @RequestParam Double min_min_cpm, @RequestParam Double max_min_cpm) throws IOException {
        List<Campaign> listedCampaignDetails = new ArrayList<>();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(LISTING_DETAILS_CSV_FILE_PATH));
            String line = "";
            fileReader.readLine();
            while ((line = fileReader.readLine()) != null) {
                String[] data = line.split(",");
                var campaign = createCampaignEntity(data);
                if (campaign.getPrice() >= min_price && campaign.getPrice() <= max_price && campaign.getMinCpm() >= min_min_cpm && campaign.getMinCpm() <= max_min_cpm)
                    listedCampaignDetails.add(campaign);
            }
            return listedCampaignDetails;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    private Campaign createCampaignEntity(String[] data) {
        Campaign campaign = new Campaign();
        campaign.setAdvertisingId(data[1]);
        campaign.setCountry(data[2]);
        campaign.setPrice(Double.parseDouble(data[3]));
        campaign.setEventTypeId(Integer.parseInt(data[4]));
        campaign.setGdpr(Integer.parseInt(data[5]));
        campaign.setMinCpm(Double.parseDouble(data[6]));
        campaign.setPriority(Double.parseDouble(data[7]));
        campaign.setBidPrice(Double.parseDouble(data[8]));
        return campaign;
    }
}
