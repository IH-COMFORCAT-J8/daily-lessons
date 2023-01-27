import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  storeName: string;
  formattedDate: string;
  isDisabledSubmit: boolean;
  isDisabledOther: boolean;
  inputPlaceholder: string;
  constructor() {
    this.storeName = 'My store';
    this.formattedDate = new Date().toLocaleDateString("es-ES");
    this.isDisabledSubmit = true;
    this.isDisabledOther = true;
    this.inputPlaceholder = 'Put your text here';
  }

  ngOnInit(): void {
  }

  onCopy() {
    alert('Enabling buttons')
    this.isDisabledSubmit = false;
    this.isDisabledOther = false;
  }

  disableBtn(event: Event) {
    console.log(event) // Print in console the event so the students can understand were to look for the data they need.
    if ((<HTMLInputElement>event.target).name == 'submit-btn') { //target must be casted because it's a generic type so Angular doesn't recognize the name property
      this.isDisabledSubmit = true;
    } else {
      this.isDisabledOther = true;
    }

  }

}
