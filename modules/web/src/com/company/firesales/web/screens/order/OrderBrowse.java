package com.company.firesales.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.firesales.entity.Order;

@UiController("firesales_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}