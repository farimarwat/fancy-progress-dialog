package com.marwatsoft.progressdialog

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import kotlin.contracts.contract

class FancyProgressDialog private constructor(builder:Builder){
    private var mContext:Context
    private lateinit var mAlertDialog:AlertDialog
    private var mMessage:String? = null
    private var mLoaderType:String = LOADER_02
 class Builder(val context:Context){
     private var mMessage:String? = null
     private var mLoaderType:String = FancyProgressDialog.LOADER_02

     //setters
     fun setMessage(message:String) = apply { this.mMessage = message }
     fun setLoader(loader:String) = apply { this.mLoaderType = loader}

     //getters
     fun getMessage():String? = this.mMessage
     fun getLoader():String = this.mLoaderType

     fun build() = FancyProgressDialog(this)
 }
    init {
        mContext = builder.context
        mMessage = builder.getMessage()
        mLoaderType = builder.getLoader()
    }

    fun show(){
        val view = LayoutInflater.from(mContext)
            .inflate(R.layout.dialog,null)
        mMessage?.let {
            val txt_loading = view.findViewById<TextView>(R.id.txt_loading)
            txt_loading.visibility = View.VISIBLE
            txt_loading.text = it
        }
        val lottie_loader = view.findViewById<LottieAnimationView>(R.id.lottie_loader)
        when(mLoaderType){
            LOADER_01 -> lottie_loader.setAnimation(R.raw.loader01)
            LOADER_02 -> lottie_loader.setAnimation(R.raw.loader02)
            LOADER_03 -> lottie_loader.setAnimation(R.raw.loader03)
            LOADER_04 -> lottie_loader.setAnimation(R.raw.loader04)
            LOADER_05 -> lottie_loader.setAnimation(R.raw.loader05)
            LOADER_06 -> lottie_loader.setAnimation(R.raw.loader06)
            LOADER_07 -> lottie_loader.setAnimation(R.raw.loader07)
            LOADER_08 -> lottie_loader.setAnimation(R.raw.loader08)
            LOADER_09 -> lottie_loader.setAnimation(R.raw.loader09)
            LOADER_10 -> lottie_loader.setAnimation(R.raw.loader10)
            LOADER_11 -> lottie_loader.setAnimation(R.raw.loader11)
            LOADER_12 -> lottie_loader.setAnimation(R.raw.loader12)
            else -> lottie_loader.setAnimation(R.raw.loader01)
        }
        val builder = AlertDialog.Builder(mContext)
        builder.setView(view)
        builder.setCancelable(false)
        mAlertDialog = builder.create()
        mAlertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        mAlertDialog.show()
    }
    fun hide(){
        if(this@FancyProgressDialog::mAlertDialog.isInitialized){
            mAlertDialog.dismiss()
        }
    }
    companion object {
        val LOADER_01 = "loader01"
        val LOADER_02 = "loader02"
        val LOADER_03 = "loader03"
        val LOADER_04 = "loader04"
        val LOADER_05 = "loader05"
        val LOADER_06 = "loader06"
        val LOADER_07 = "loader07"
        val LOADER_08 = "loader08"
        val LOADER_09 = "loader09"
        val LOADER_10 = "loader10"
        val LOADER_11 = "loader11"
        val LOADER_12 = "loader12"
    }
}