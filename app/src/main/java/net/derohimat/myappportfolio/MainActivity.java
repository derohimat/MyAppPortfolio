package net.derohimat.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnPopularMovies, mBtnStockHawk, mBtnBuildItBigger,
            mBtnMakeAppMaterial, mBtnGoUbiquitous, mBtnMyOwnApp;
    private Toast mToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);
        mBtnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        mBtnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        mBtnMakeAppMaterial = (Button) findViewById(R.id.btnMakeAppMaterial);
        mBtnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        mBtnMyOwnApp = (Button) findViewById(R.id.btnMyOwnApp);

        mBtnPopularMovies.setOnClickListener(this);
        mBtnStockHawk.setOnClickListener(this);
        mBtnBuildItBigger.setOnClickListener(this);
        mBtnMakeAppMaterial.setOnClickListener(this);
        mBtnGoUbiquitous.setOnClickListener(this);
        mBtnMyOwnApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
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
