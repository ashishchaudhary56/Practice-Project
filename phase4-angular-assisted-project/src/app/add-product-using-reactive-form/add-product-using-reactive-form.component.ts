import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'add-product-using-reactive-form',
  templateUrl: './add-product-using-reactive-form.component.html',
  styleUrls: ['./add-product-using-reactive-form.component.css']
})
export class AddProductUsingReactiveFormComponent implements OnInit{

  name:string = '';
  price:number=0;
  submitted:boolean = false;

  addProductForm!: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.addProductForm = this.formBuilder.group({
      name: new FormControl('',Validators.required),
      price:new FormControl<number>(0,[Validators.required, Validators.min(1), Validators.max(100000)])
    });
  }

  get f() { return this.addProductForm.controls; }

  onSubmit():void {
    this.submitted = true;

    console.log("Form submited..");


    // stop here if form is invalid
    if (this.addProductForm.invalid) {
      return;
    };

    console.log('Your product has been submitted for approval');
  }

}