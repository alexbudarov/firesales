package com.company.firesales.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.firesales.entity.Customer;

@UiController("firesales_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CustomerBrowse extends MasterDetailScreen<Customer> {
}