package com.example.assignment5

import  android.os.Parcelable
import  kotlinx.android.parcel.Parcelize

@Parcelize
class Employee(val name: String, val gender:String, val email: String, val salary: Int) : Parcelable{

}