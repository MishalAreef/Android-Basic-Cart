package com.example.ecupcake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
    private ImageView classic, themed, birthday, anniversary;
    private ImageView baby, valentine, graduation, mother;
    private ImageView premium1, premium2, premium3, premium4;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        classic = (ImageView) findViewById(R.id.classic_cupcakes);
        themed = (ImageView) findViewById(R.id.themed_cupcakes);
        birthday = (ImageView) findViewById(R.id.birthday_cupcakes);
        anniversary = (ImageView) findViewById(R.id.anniversary_cupcakes);

        baby = (ImageView) findViewById(R.id.new_baby_cupcakes);
        valentine = (ImageView) findViewById(R.id.valentines_cupcakes);
        graduation = (ImageView) findViewById(R.id.graduation_cupcakes);
        mother = (ImageView) findViewById(R.id.mothers_day_cupcakes);

        premium1 = (ImageView) findViewById(R.id.premium1_cupcakes);
        premium2 = (ImageView) findViewById(R.id.premium2_cupcakes);
        premium3 = (ImageView) findViewById(R.id.premium3_cupcakes);
        premium4 = (ImageView) findViewById(R.id.premium4_cupcakes);



        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
                {
                    Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                    intent.putExtra("category", "Classic");
                    startActivity(intent);
                }

        });

        themed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Themed");
                startActivity(intent);
            }
        });

        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Birthday");
                startActivity(intent);
            }
        });

        anniversary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Anniversary");
                startActivity(intent);
            }
        });

        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Baby");
                startActivity(intent);
            }
        });

        valentine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Valentine");
                startActivity(intent);
            }
        });

        graduation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Graduation");
                startActivity(intent);
            }
        });

        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Mother");
                startActivity(intent);
            }
        });

        premium1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Premium 1 ");
                startActivity(intent);
            }
        });

        premium2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Premium 2");
                startActivity(intent);
            }
        });

        premium3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Premium 3");
                startActivity(intent);
            }
        });

        premium4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, Main2Activity.class);
                intent.putExtra("category", "Premium 4");
                startActivity(intent);
            }
        });
    }
}
