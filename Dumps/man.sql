PGDMP         #                w           man    11.5    11.5     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �
           1262    16394    man    DATABASE     �   CREATE DATABASE man WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United Kingdom.1252' LC_CTYPE = 'English_United Kingdom.1252';
    DROP DATABASE man;
             postgres    false            �            1259    16488    vehicle    TABLE     �   CREATE TABLE public.vehicle (
    id integer NOT NULL,
    name text,
    engine text,
    productionyear date,
    horsepower integer,
    price integer
);
    DROP TABLE public.vehicle;
       public         postgres    false            �
          0    16488    vehicle 
   TABLE DATA               V   COPY public.vehicle (id, name, engine, productionyear, horsepower, price) FROM stdin;
    public       postgres    false    196   p       }
           2606    16495    vehicle Vehicle_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.vehicle
    ADD CONSTRAINT "Vehicle_pkey" PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.vehicle DROP CONSTRAINT "Vehicle_pkey";
       public         postgres    false    196            �
      x������ � �     