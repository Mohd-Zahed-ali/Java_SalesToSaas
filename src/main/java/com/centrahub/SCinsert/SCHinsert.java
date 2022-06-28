package com.centrahub.SCinsert;
import com.centrahub.SalesToSC.SalesToSC;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
//implements CommandLineRunner
public class SCHinsert   {
	/*public static int inserttoSC() {
	return 1;
	}*/
	/* @Override
	    public void run(String... args) throws Exception {
	        String sql = "insert into [dbo].[nCore_SaaSContract_SaaS_History]([iMasterId],[AdditionalExternalUser],[AdditionalLightUser],[AmountLocal],[BaseUser],[LicenseType],[LightUser],[NetAmountLocal]\r\n"
	        		+ "      ,[NetAmountUSD],[Quantity],[ResellerPercentage],[SalePercentage],[StreamType],[Tax1],[Tax1Amount],[Tax2],[Tax2Amount],[Tax3],[Tax3Amount],[TaxAmountLocal],[TaxAmountUSD],[TaxCode],[TaxPercentage]\r\n"
	        		+ "      ,[iProductId],[ProductDescription],[SaleLicensePrice],[StdLicensePriceLocal],[iProductGroupId],[NoofUsers],[fPerUserAmount],[fAdditionalUserCost],[fLightUsersCost],[iLightUserPercent],\r\n"
	        		+ "	  iCreatedDate,AdditionalUser) values (";
	        List<Customer> customers = jdbcTemplate.query(sql,
	                BeanPropertyRowMapper.newInstance(Customer.class));
	        customers.forEach(System.out :: println);
	    }*/
}
