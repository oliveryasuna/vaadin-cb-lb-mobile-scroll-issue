package com.example.application;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;

@Route("/")
public class View extends VerticalLayout {

  public View() {
    add(createComboBox());
    add(createSelect());
  }

  private ComboBox<String> createComboBox() {
    final ComboBox<String> comboBox = new ComboBox<>();

    comboBox.setLabel("Combo Box");
    comboBox.setItems("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen");

    return comboBox;
  }

  private Select<String> createSelect() {
    final Select<String> select = new Select<>();

    select.setLabel("Select");
    select.setItems("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen");

    return select;
  }

}
