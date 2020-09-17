package com.company.firesales.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.firesales.entity.Product;

@UiController("firesales_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductBrowse extends MasterDetailScreen<Product> {
}