import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {

  shoppingItems : string[]
  item: string = ''

  constructor() {

    this.shoppingItems = ['Milk', 'Sugar', 'Cocoa']

   }

  ngOnInit(): void {
  }

  addItem() {
    this.shoppingItems.push(this.item)
    this.item = ''
  }

  delete(index: number) {
    this.shoppingItems.splice(index, 1)
  }

  getClass(index: number): string { 
    return index % 2 === 0 ? 'even' : 'odd'
  }

}
