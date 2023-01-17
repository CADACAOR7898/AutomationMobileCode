package com.nttdata.steps;

import com.nttdata.screens.InventoryScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabsInventorySteps {

    InventoryScreen inventoryScreen;

    @Step("Obtiene el texto")
    public String getTitleText(){
        return inventoryScreen.getTitleText();
    }

    @Step("Obtiene el texto del item")
    public String getItemName(){
        return inventoryScreen.getItemNameText();
    }

}
