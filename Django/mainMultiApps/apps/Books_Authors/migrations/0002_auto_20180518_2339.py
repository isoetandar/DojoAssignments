# -*- coding: utf-8 -*-
# Generated by Django 1.10 on 2018-05-18 23:39
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Books_Authors', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='books_authors',
            name='author',
        ),
        migrations.RemoveField(
            model_name='books_authors',
            name='book',
        ),
        migrations.AddField(
            model_name='author',
            name='books',
            field=models.ManyToManyField(related_name='books', to='Books_Authors.Book'),
        ),
        migrations.DeleteModel(
            name='Books_Authors',
        ),
    ]
