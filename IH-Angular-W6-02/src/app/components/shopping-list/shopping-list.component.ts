import { Component, OnInit } from '@angular/core';
import { ShoppingItem } from 'src/app/models/shopping-item';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {

  shoppingItems : ShoppingItem[]
  item: string = ''
  quantity: number

  constructor() {

    this.shoppingItems = [new ShoppingItem('Leche', 2)]
    this.quantity = 1

   }

  ngOnInit(): void {
  }

  addItem() {
    if(this.item === '') return
    this.shoppingItems.push(new ShoppingItem(this.item, this.quantity))
    this.item = ''
  }

  delete(index: number) {
    this.shoppingItems.splice(index, 1)
  }

  getClass(index: number): string { 
    return index % 2 === 0 ? 'even' : 'odd'
  }

}
