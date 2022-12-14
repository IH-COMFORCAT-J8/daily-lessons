import { Component, OnInit } from '@angular/core';
import { Fan } from 'src/app/models/fan';

@Component({
  selector: 'app-fan-list',
  templateUrl: './fan-list.component.html',
  styleUrls: ['./fan-list.component.css']
})
export class FanListComponent implements OnInit {

  fanName: string = ''
  fanAge: number = 0
  fanCountry: string = ''
  fanTeam: string = ''
  fanProfilePicture: string = ''

  defaultProfilePicture: string = 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'


  franceFans: Fan[] = []
  moroccoFans: Fan[] = []


  constructor() {

    this.moroccoFans.push(new Fan('Mohamed', 20, 'Morocco', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'))
    this.moroccoFans.push(new Fan('Ahmed', 20, 'Morocco', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'))
    this.moroccoFans.push(new Fan('Youssef', 20, 'Morocco', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'))

    this.franceFans.push(new Fan('Jean', 20, 'France', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'))
    this.franceFans.push(new Fan('Pierre', 20, 'France', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'))
    this.franceFans.push(new Fan('Paul', 20, 'France', 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/1200px-Default_pfp.svg.png'))
  }

  ngOnInit(): void {

  }

  addFan(): void {
    if (this.fanTeam == 'france') {
      this.franceFans.push(new Fan(this.fanName, this.fanAge, this.fanCountry, this.defaultProfilePicture))
    } else if (this.fanTeam == 'morocco') {
      this.moroccoFans.push(new Fan(this.fanName, this.fanAge, this.fanCountry, this.defaultProfilePicture))
    }
  }

  changeTeam(index: number, team: string) {

    if (team === 'morocco') {
      this.franceFans.push(this.moroccoFans[index])
      this.moroccoFans.splice(index, 1)
    } else if (team === 'france') {
      this.moroccoFans.push(this.franceFans[index])
      this.franceFans.splice(index, 1)
    }


  }

  deleteFan(index: number, team: string) {
    if (team === 'morocco') {
      this.moroccoFans.splice(index, 1)
    } else if (team === 'france') {
      this.franceFans.splice(index, 1)
    }
  }

}
