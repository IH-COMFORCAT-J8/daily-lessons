import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  storeName: string;
  formattedDate: string;
  isDisabled: boolean = true;
  inputPlaceHolder: string = 'Introduce tu nombre';
  name: string = '';
  backgroundColor = 'red';

  constructor() {
    this.storeName = 'Iron Store'
    this.formattedDate = new Date().toDateString()
   }

  ngOnInit(): void {
  }

  enableOrDisableButton(): void {

    this.isDisabled = !this.isDisabled;
  }

  showWelcomeMessage() {
    alert('Bienvenido/a a Iron Store');
    this.storeName = 'Iron Shop';
  }

  showName() {
    console.log(this.name);
  }

  enableButton() {
    if(this.name.length > 4) {
      this.backgroundColor = 'green'
      this.isDisabled = false;
    } else if (this.name.length < 4) {
      this.backgroundColor = 'red'
      this.isDisabled = true;
    }
  }

}
