import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Fan } from 'src/app/models/fan';

@Component({
  selector: 'app-fan-card',
  templateUrl: './fan-card.component.html',
  styleUrls: ['./fan-card.component.css']
})
export class FanCardComponent implements OnInit {
  @Input()
  fan: Fan;
  @Input()
  index: number;

  @Output()
  fanDeleted = new EventEmitter<number>();

  @Output()
  fanChanged = new EventEmitter<number>();

  constructor() {
    this.fan = new Fan('', 0, '', '');
    this.index = 0;
  }

  ngOnInit(): void {
  }

  deleteFan(): void {
    this.fanDeleted.emit(this.index);
   
  }

  changeTeam(): void {
    this.fanChanged.emit(this.index);
  
  }

}
