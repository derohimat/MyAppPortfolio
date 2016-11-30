package net.derohimat.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        switch (v.getId()) {
            case R.id.btnPopularMovies:
                showToast(R.string.popular_movies);
                break;
            case R.id.btnStockHawk:
                showToast(R.string.stock_hawk);
                break;
            case R.id.btnBuildItBigger:
                showToast(R.string.build_it_bigger);
                break;
            case R.id.btnMakeAppMaterial:
                showToast(R.string.make_your_app_material);
                break;
            case R.id.btnGoUbiquitous:
                showToast(R.string.go_ubiquitous);
                break;
            case R.id.btnMyOwnApp:
                showToast(R.string.capstone_my_own_app);
                break;
            default:
                break;
        }
    }

    private void showToast(int resource) {
        String toastString = String.format(getResources().getString(R.string.string_toast),
                getResources().getString(resource).toLowerCase());

        if (mToast != null) {
            mToast.cancel();
        }

        mToast.makeText(this, toastString, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        if (mToast != null) {
            mToast = null;
        }
        super.onDestroy();
    }
}
