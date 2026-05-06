package win.netcloak.app.ui

import android.os.Bundle
import win.netcloak.app.R
import win.netcloak.app.core.CoreServiceManager

class ScStartActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moveTaskToBack(true)

        setContentView(R.layout.activity_none)

        if (!CoreServiceManager.isRunning()) {
            CoreServiceManager.startVServiceFromToggle(this)
        }
        finish()
    }
}

