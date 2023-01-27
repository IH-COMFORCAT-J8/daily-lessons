import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  genders : string[]
  careers : string[]
  registerForm : FormGroup

  constructor() {
    this.genders = ['male', 'female', 'non-binary']
    this.careers = [' Computer Science', 'Mathematics', 'Biology', 'Physics']
    this.registerForm = new FormGroup({
      'name' : new FormControl(null, [Validators.required, Validators.minLength(5)]),
      'email': new FormControl(null, [Validators.required, Validators.email]),
      'gender': new FormControl('female', [Validators.required]),
      'age' : new FormControl(null, [Validators.required, Validators.min(0), Validators.max(150)]),
      'career' : new FormControl(null, [Validators.required])
    })
   }

  ngOnInit(): void {
  }

  onSubmit() {

    console.log(this.registerForm.value.name)
    console.log(this.registerForm.value.age)
    console.log(this.registerForm.value.gender)


  }

}
