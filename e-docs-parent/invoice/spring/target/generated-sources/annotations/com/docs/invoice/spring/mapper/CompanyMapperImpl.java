package com.docs.invoice.spring.mapper;

import com.docs.invoice.api.domain.Company;
import com.docs.invoice.api.domain.Company.CompanyBuilder;
import com.docs.invoice.spring.dto.in.CompanyIn;
import com.docs.invoice.spring.dto.out.CompanyOut;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T12:08:46+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public Company updateCompany(CompanyIn companyIn, Company company) {
        if ( companyIn == null ) {
            return null;
        }

        company.setName( companyIn.getName() );
        company.setShortName( companyIn.getShortName() );
        company.setVat( companyIn.getVat() );
        company.setUid( companyIn.getUid() );
        company.setEmail( companyIn.getEmail() );
        company.setAddress( companyIn.getAddress() );
        company.setCity( companyIn.getCity() );
        company.setCountry( companyIn.getCountry() );
        company.setPhone( companyIn.getPhone() );

        return company;
    }

    @Override
    public Company toEntity(CompanyIn company) {
        if ( company == null ) {
            return null;
        }

        CompanyBuilder company1 = Company.builder();

        company1.name( company.getName() );
        company1.shortName( company.getShortName() );
        company1.vat( company.getVat() );
        company1.uid( company.getUid() );
        company1.email( company.getEmail() );
        company1.address( company.getAddress() );
        company1.city( company.getCity() );
        company1.country( company.getCountry() );
        company1.phone( company.getPhone() );

        return company1.build();
    }

    @Override
    public CompanyOut toDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyOut companyOut = new CompanyOut();

        companyOut.setId( company.getId() );
        companyOut.setName( company.getName() );
        companyOut.setShortName( company.getShortName() );
        companyOut.setVat( company.getVat() );
        companyOut.setUid( company.getUid() );
        companyOut.setEmail( company.getEmail() );
        companyOut.setAddress( company.getAddress() );
        companyOut.setCity( company.getCity() );
        companyOut.setCountry( company.getCountry() );
        companyOut.setPhone( company.getPhone() );

        return companyOut;
    }
}
