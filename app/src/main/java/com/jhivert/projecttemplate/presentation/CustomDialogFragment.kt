package com.jhivert.projecttemplate.presentation

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class CustomDialogFragment: DialogFragment() {

    companion object {
        fun newInstance(title: CharSequence?, message: CharSequence?): CustomDialogFragment {
            val fragment =
                CustomDialogFragment()
            val args = Bundle()
            args.putCharSequence("title", title)
            args.putCharSequence("message", message)
            fragment.arguments = args
            return fragment
        }
    }

    interface DialogClickListener {
        fun onPositiveClick()
        fun onNegativeClick()
    }

    lateinit var listener: DialogClickListener

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle(arguments?.getCharSequence("title"))
        builder.setMessage(arguments?.getCharSequence("message")).setPositiveButton("OK") { _, _ ->
            listener.onPositiveClick()
        }.setNegativeButton("") { _, _ ->
            listener.onNegativeClick()
        }
        return builder.create()
    }
}