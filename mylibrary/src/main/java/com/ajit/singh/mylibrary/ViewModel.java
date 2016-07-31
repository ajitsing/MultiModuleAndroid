package com.ajit.singh.mylibrary;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.ajit.singh.mylibrary.BR;

public class ViewModel extends BaseObservable {
  private String name;

  public ViewModel(String name) {
    this.name = name;
  }

  @Bindable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    notifyPropertyChanged(BR.name);
  }
}
