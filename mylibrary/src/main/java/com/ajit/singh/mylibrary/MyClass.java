package com.ajit.singh.mylibrary;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.ajit.singh.mylibrary.databinding.MyBinding;

public class MyClass extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MyBinding binding = DataBindingUtil.setContentView(this, R.layout.mylayout);
    binding.setViewModel(new ViewModel("Ajit"));
  }
}
