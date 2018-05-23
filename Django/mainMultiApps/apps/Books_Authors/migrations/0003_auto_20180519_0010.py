# -*- coding: utf-8 -*-
# Generated by Django 1.10 on 2018-05-19 00:10
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Books_Authors', '0002_auto_20180518_2339'),
    ]

    operations = [
        migrations.AlterField(
            model_name='author',
            name='books',
            field=models.ManyToManyField(related_name='authors', to='Books_Authors.Book'),
        ),
    ]
