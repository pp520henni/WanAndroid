package net.wan.android.ui.fragment.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.wan.android.base.BaseFragment
import net.wan.android.databinding.FragmentLoginBinding
import net.wan.android.ui.viewmodel.state.LoginViewModel

class LoginFragment : BaseFragment<LoginViewModel, FragmentLoginBinding>() {


    inner class ProxyClick{
        fun onLogin(){

        }

        fun onRegister(){

        }
    }

    override fun initView() {
    }
}