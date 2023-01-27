import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-text-editor',
  templateUrl: './text-editor.component.html',
  styleUrls: ['./text-editor.component.css']
})
export class TextEditorComponent implements OnInit {

  textInput: string = ''
  fontSize: number = 24;

  constructor() {
  }
  
  ngOnInit(): void {
  }

  increaseSize() {
    this.fontSize+=5;
    console.log(this.fontSize);
  } 
  
  decreaseSize() {
    if(this.fontSize>0) this.fontSize-=5;
    console.log(this.fontSize);
  }


}
