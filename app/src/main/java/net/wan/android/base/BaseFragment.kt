package net.wan.android.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.wan.android.ext.dip2px
import net.wan.android.library.getVMClazz
import net.wan.android.library.inflateBindingWithGeneric
import net.wan.android.util.UIUtil

abstract class BaseFragment<VM : ViewModel, DB : ViewDataBinding> : Fragment() {
    private var _binding : DB? = null
    val binding : DB get() = _binding!!
    lateinit var mState : VM
    protected var bundle : Bundle? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  inflateBindingWithGeneric(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mState = createViewModel()
        binding.setVariable(BR.vm, mState)
        bundle = arguments
        initView()
    }

    private fun createViewModel() : VM{
        return ViewModelProvider(this).get(getVMClazz(this))
    }

    abstract fun initView()

    protected fun setVariable(variableId : Int, value : Any){
        binding.setVariable(variableId, value)
    }

    protected fun setVariable(map : Map<Int, Any>){
        map.forEach{
            binding.setVariable(it.key, it.value)
        }
    }

    fun initToolbar(toolbar : Toolbar){
        val statusBar = UIUtil.getStatusBarHeight()
        toolbar.let {
            it.setPadding(0, statusBar, 0, 0)
            it.layoutParams.height = statusBar + UIUtil.ACTION_BAR_HEIGHT.dip2px()
        }
    }


//    protected fun <T> getViewModel(modelClass: Class<T>) : T{
//        return ViewModelProvider(this).get(modelClass)
//    }
}