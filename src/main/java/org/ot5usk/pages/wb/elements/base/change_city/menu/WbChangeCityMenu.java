package org.ot5usk.pages.wb.elements.base.change_city.menu;

import org.ot5usk.pages.wb.elements.base.change_city.menu.elements.WbChangeCityAddressesBlock;
import org.ot5usk.pages.wb.elements.base.change_city.menu.elements.WbChangeCitySearchBar;

public class WbChangeCityMenu {

    private final WbChangeCitySearchBar searchBar;
    private final WbChangeCityAddressesBlock addressesBlock;

    public WbChangeCityMenu() {
        searchBar = new WbChangeCitySearchBar();
        addressesBlock = new WbChangeCityAddressesBlock();
    }

    public WbChangeCitySearchBar searchBar() {
        return searchBar;
    }

    public WbChangeCityAddressesBlock addressesBlock() {
        return addressesBlock;
    }
}
